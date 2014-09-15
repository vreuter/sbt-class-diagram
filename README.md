# sbt-class-diagram [![Build Status](https://secure.travis-ci.org/xuwei-k/sbt-class-diagram.png?branch=master)](http://travis-ci.org/xuwei-k/sbt-class-diagram)

### requirement

- <http://www.graphviz.org/>
- sbt 0.13.x

### install

- `project/plugin.sbt`

```scala
addSbtPlugin("com.github.xuwei-k" % "sbt-class-diagram" % "0.1.4")
```


- `build.sbt`

```scala
classDiagramSettings
```

### sample

#### scala.collection.immutable.List

![List](https://raw.githubusercontent.com/xuwei-k/sbt-class-diagram/master/sample/list.png)


#### scalaz 7.1.x

![Scalaz](https://raw.githubusercontent.com/xuwei-k/sbt-class-diagram/master/sample/scalaz.png)

