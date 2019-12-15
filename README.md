# Slinky react-router-native
Refactoring of [react-router-native basic example](https://reacttraining.com/react-router/native/example/Basic) coded in [Scala](https://scala-lang.org/) through [Scala.js](https://www.scala-js.org), [Slinky](https://slinky.dev), [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped) and [Expo](https://expo.io).

## How to
### Build the app
Make sure you have [sbt](https://www.scala-sbt.org/) and [npm](https://www.npmjs.com/) installed.

First compile your Scala code to JavaScript by running:
```sh
$ sbt fastOptJS
```

Then, launch the app with Expo:
```sh
$ npm start
```

### See the app already published with Expo
Go to the [app Expo page](https://expo.io/@mcallisto/slinky-router-native-basic).

## Contribute

Help is needed, with the aim of mapping 100% of the react-router-native demo features.

## Acknowledgements
`slinky-react-router-native` is based on Slinky's [Expo Scala Template](https://github.com/shadaj/expo-template-scala).

This demo uses the Scala.js typings and the thin facades developed by Øyvind Raddum Berg:
*   [react-slinky](https://github.com/oyvindberg/ScalablyTyped/tree/master/facades/react-slinky)
*   [react-router-native-slinky](https://github.com/oyvindberg/ScalablyTyped/tree/master/facades/react-router-native-slinky)
