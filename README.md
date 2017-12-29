# nccu-2017-ai-java-project  [![Build Status](https://travis-ci.org/mybaseball52/nccu-2017-ai-java-project.svg?branch=master)](https://travis-ci.org/mybaseball52/nccu-2017-ai-java-project)

政大 2017 人工智慧作業程式 - 有障礙的跳棋問題系列

##作業說明
* 跳棋下棋的規則，排除鏡射的跳法
* 不可以使用非法的外部工具，例如存取其他跳棋程式
* 棋盤為一般的跳棋棋盤，見下圖
* 工作目標：可見測試檔

![alt text](docs/board.png)

##如何開始
以下的範例會指導如何在您的機器上運行本程式。

###Pre-Requisites
* Java 版本 - open-jdk 7 or oracle-jdk 8
* Maven 3 - 如果您使用 maven 進行程式建置的話
* Junit 4 - 執行測試

##執行測試

```
mvn test -B
```

##使用技術
* [Maven](https://maven.apache.org/) - Dependency Management
* [Travis.ci](https://travis-ci.org/mybaseball52/nccu-2017-ai-java-project) - CI server

## 作者