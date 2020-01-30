# Slinky react-router-native
Refactoring of [react-router-native basic example](https://reacttraining.com/react-router/native/example/Basic) coded in [Scala](https://scala-lang.org/) through [Scala.js](https://www.scala-js.org), [Slinky](https://slinky.dev), [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped) and [Expo](https://expo.io).

## Try the demo app
Go to the [app Expo page](https://expo.io/@mcallisto/slinky-router-native-basic).

## Requirements
Make sure you have [sbt](https://www.scala-sbt.org) and [yarn](https://yarnpkg.com) installed.

### Install the Expo CLI
```sh
$ yarn global add expo-cli
```

## How to
### Run in development

First compile your Scala code to JavaScript by running:
```sh
$ sbt fastOptJS
```

Then, launch the app with Expo:
```sh
$ expo start
```

## Contribute

Help is needed, with the aim of mapping 100% of the react-router-native examples.

## Acknowledgements
`slinky-react-router-native` is based on Slinky's [Expo Scala Template](https://github.com/shadaj/expo-template-scala).

This demo uses the Scala.js typings developed by Øyvind Raddum Berg, see more demos at [SlinkyDemos](https://github.com/ScalablyTyped/SlinkyDemos).
