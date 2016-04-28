# ReactGWT
todo generaloverview, desc who we are, use in production, etc

## Quick Start
todo direct them to the boilerplate project
provide instructions on how to use it

## Component Libraries
link to material-ui-gwt and camber repositories

## More than a GWT wrapper of React
describe the diff peices of

#### Injection and Code Splitting
todo desc how dagger is the recommended way by gwt team for injection and how we impl Dagger modules and integrate with routing

#### Event Bus
all the tools needed to create your own typesafe flux pattern

#### Remoting

## Roadmap
As of the 0.3.0 relase the API is stable and will see very few breaking changes. Please take a look at our GitHub issues to see what features we plan on implmenting.

## FAQ
#### Why use @JsInterop interfaces?
GWT uses a number of backing maps and objects to track property castability when using @JsType on classes. By creating java interfaces with @JsType(isNative=true) the backing Javascript objects do not contain this extra cruft.

## Contributing
todo text about how stoked we are to get contributions and link to contributing guidelines
