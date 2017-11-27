package homework;

public class BoardCopy {
        // Maximum number of players
        public static final int MAX_PLAYERS = 6;

        // Maximum width and height of the board
        public static final int
                WIDTH = 13,
                HEIGHT = 17;

        // Width of each row of the board
        private static final int[] WIDTHS = {
                1,2,3,4,13,12,11,10,9,10,11,12,13,4,3,2,1
        };

        // How far each row of the board is offset
        private static final int[] OFFSETS = {
                6,5,5,4,0,0,1,1,2,1,1,0,0,4,5,5,6
        };

        // Number of rows in a player's home
        private static final int HOME_HEIGHT = 4;

        private final Color[][] grid;  // The board's grid
        private Color pov;             // The current point-of-view

        /**
         * Constructs an empty board
         */
        BoardCopy () {
            grid = new Color[HEIGHT][];
            for (int y = 0; y < HEIGHT; y++)
                grid[y] = new Color[WIDTHS[y]];

            pov = Color.values()[0];
        }

        /**
         * Constructs a shallow copy of an existing board.
         * Changes in one board will be reflected in the other.
         * Useful when maintaining multiple views with different perspectives.
         */
        BoardCopy (BoardCopy  board) {
            grid = board.grid;
            pov = board.pov;
        }

        /**
         * Transforms relative coordinates into grid indices.
         */
        private int[] getAbsoluteCoords(int x, int y) {
            final int x0 = WIDTH/2;
            final int y0 = HEIGHT/2;
            final double root = Math.sqrt(3)/2;

            for (int i = 0; i < pov.ordinal(); i++) {
                // Shift center of board to the origin, and contract vertically
                double x1 = (x-x0);
                double y1 = (y-y0) * root;

                // Shift uneven rows to the right
                if (y%2 != 0)
                    x1 += 0.5;

                // Rotate board around the origin, and expand vertically
                double x2 = (x1*0.5  - y1*root);
                double y2 = (x1*root + y1*0.5 ) / root;

                // Shift top left of board back to the origin
                x = (int) (x2+x0);
                y = (int) Math.round(y2+y0);
            }

            x -= OFFSETS[y];
            return new int[] {x,y};
        }

        /**
         * Checks whether the given values are valid coordinates.
         */
        public static boolean validCoords(int x, int y) {
            if (y < 0 || y >= HEIGHT)
                return false;

            x -= OFFSETS[y];
            if (x < 0 || x >= WIDTHS[y])
                return false;

            return true;
        }

        /**
         * Asserts that the given values are valid coordinates.
         */
        public static void assertCoords(int x, int y) {
            if (!validCoords(x,y))
                throw new IllegalArgumentException(
                        String.format("Invalid coordinates: (%d,%d)", x, y));
        }

        /**
         * Retrieves the color currently occupying a position.
         * Returns null if the position is empty.
         */
        public Color get(int x, int y) {
            assertCoords(x,y);
            int[] coords = getAbsoluteCoords(x,y);
            return grid[coords[1]][coords[0]];
        }

        /**
         * Puts the given color into a position.
         * Putting null will empty the position.
         */
        void put(Color color, int x, int y) {
            assertCoords(x,y);
            int[] coords = getAbsoluteCoords(x,y);
            grid[coords[1]][coords[0]] = color;
        }

        /**
         * Returns the current point-of-view.
         */
        public Color pointOfView() {
            return pov;
        }

        /**
         * Rotates the board to a new point-of-view.
         */
        public void rotate(Color pov) {
            if (pov == null)
                throw new NullPointerException();

            this.pov = pov;
        }

        /**
         * Returns all x-coordinates in a given row.
         */
        private static int[] xCoords(int y) {
            int width = WIDTHS[y];
            int offset = OFFSETS[y];

            int[] result = new int[width];
            for (int i = 0; i < width; i++)
                result[i] = i + offset;

            return result;
        }

        /**
         * Fills a color's home with its pieces.
         */
        void fillHome(Color home) {
            Color back = pov;
            rotate(home);

            for (int y = HEIGHT - HOME_HEIGHT; y < HEIGHT; y++)
                for (int x: xCoords(y))
                    put(home, x, y);

            rotate(back);
        }

        /**
         * Checks whether a color has filled its target.
         * Targets are opposite to the color's home.
         */
        public boolean isTargetFilled(Color home) {
            Color back = pov;
            rotate(home);

            for (int y = 0; y < HOME_HEIGHT; y++)
                for (int x: xCoords(y))
                    if (get(x,y) != home) {
                        rotate(back);
                        return false;
                    }

            rotate(back);
            return true;
        }
}
