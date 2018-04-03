
# react-native-rust-jose-c

## Getting started

`$ npm install react-native-rust-jose-c --save`

### Mostly automatic installation

`$ react-native link react-native-rust-jose-c`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNRustJoseCPackage;` to the imports at the top of the file
  - Add `new RNRustJoseCPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-rust-jose-c'
  	project(':react-native-rust-jose-c').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-rust-jose-c/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-rust-jose-c')
  	```


## Usage
```javascript
import RNRustJoseC from 'react-native-rust-jose-c';

// TODO: What to do with the module?
RNRustJoseC;
```
  