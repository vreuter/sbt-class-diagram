enablePlugins(ClassDiagramPlugin)

val scalazVersion = "7.3.0-SNAPSHOT"

scalaVersion := "2.11.11"

libraryDependencies += "org.scalaz" %% "scalaz-core" % scalazVersion

resolvers += Opts.resolver.sonatypeSnapshots

def urlMap(clazz: Class[_]): Map[String, String] =
  if (clazz.getName.startsWith("scalaz"))
    Map(
      "href" -> s"https://github.com/scalaz/scalaz/tree/7f5bbf571/core/src/main/scala/${clazz.getName.replace('.', '/')}.scala",
      "fontsize" -> "10",
      "height" -> ".4",
      "width" -> ".4",
      "label" -> diagram.ClassNode.decodeClassName(clazz.getSimpleName).replace("\\", "\\\\"),
      "tooltip" -> clazz.getName
    )
  else
    Map()

classDiagramSetting ~= { s =>
  s.copy(
    nodeSetting = clazz => s.nodeSetting(clazz) ++ urlMap(clazz),
    filter = { clazz =>
      clazz != classOf[java.lang.Object] && !clazz.getName.endsWith("Parent")
    },
    commonNodeSetting = s.commonNodeSetting + ("target" -> "_blank")
  )
}
