{ pkgs, lib, config, inputs, ... }:
{
  name = "leetcode";

  cachix.enable = false;

  packages = [
    pkgs.git
  ];

  languages.scala = {
    enable = true;
    package = pkgs.scala_3;
    sbt = {
      enable = true;
    };
  };

  enterShell = ''
    echo "~~~ tttm ~~~"
    type javac && type scalac
    echo "JAVA_HOME=$JAVA_HOME"
  '';

  enterTest = ''
    echo "Running tests"
    sbt test
  '';

}
