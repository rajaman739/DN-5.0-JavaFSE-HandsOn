# React Components – Theory

## Objectives

- Explain React components
- Identify the differences between components and JavaScript functions
- Identify the types of components
- Explain class component
- Explain function component
- Define component constructor
- Define the `render()` function

---

# Introduction

React is a popular JavaScript library used for building user interfaces. It allows developers to create web applications by dividing the user interface into small and reusable pieces called **components**. Components make the code organized, reusable, and easy to maintain. Instead of writing the same code multiple times, a developer can create a component once and use it wherever required in the application.

In this experiment, I learned about React components, their types, the differences between React components and normal JavaScript functions, and the concepts of constructors and the `render()` method used in class components.

---

# 1. React Components

A **React component** is a reusable block of code that represents a part of the user interface. Every React application is made up of one or more components. Each component is responsible for displaying a specific part of the application.

Components help in making the application modular because each component performs a separate task. If any changes are required, they can be made in a single component without affecting the rest of the application.

For example, in a Student Management Portal, different pages such as Home, About, and Contact can be created as separate components. These components are then combined together to form the complete application.

### Advantages of React Components

- Components are reusable.
- They make code easier to understand.
- They improve code maintenance.
- They help in organizing large applications.
- Different developers can work on different components independently.

---

# 2. Difference Between React Components and JavaScript Functions

Although React components are written using JavaScript, they are different from normal JavaScript functions.

| React Component | JavaScript Function |
|-----------------|---------------------|
| Used to create user interface elements. | Used to perform logical operations or calculations. |
| Returns JSX. | Returns JavaScript values. |
| Can receive data using props. | Receives normal function parameters. |
| Used inside React applications. | Used in any JavaScript program. |
| Invoked using `<Component />`. | Invoked using `functionName()`. |

### Explanation

A normal JavaScript function is mainly used to perform calculations, manipulate data, or execute some logic. On the other hand, a React component is specially designed to create and display parts of a web page.

Both are written using JavaScript syntax, but React components return JSX, which looks similar to HTML and is understood by React.

---

# 3. Types of React Components

React mainly provides two types of components.

## 3.1 Function Component

A Function Component is the simplest way to create a component in React. It is written as a normal JavaScript function and returns JSX.

Function components are lightweight, easy to understand, and widely used in modern React development.

### Features

- Easy to write
- Easy to maintain
- Returns JSX
- Can use React Hooks
- Preferred in modern React applications

### Example

```jsx
function Home() {
    return <h1>Welcome to Home Page</h1>;
}
```

---

## 3.2 Class Component

A Class Component is created using JavaScript classes. It extends the `React.Component` class and must contain a `render()` method.

Class components were commonly used before React Hooks were introduced. They allow developers to manage state and lifecycle methods.

### Features

- Written using ES6 classes
- Extends `React.Component`
- Uses the `render()` method
- Can have constructors
- Supports state management

### Example

```jsx
class Home extends React.Component {
    render() {
        return (
            <h1>Welcome to Home Page</h1>
        );
    }
}
```

---

# 4. Class Component

A Class Component is one of the two main types of React components. It is created using JavaScript classes and inherits features from the `React.Component` class.

Every class component must contain a `render()` method because React uses this method to display the user interface.

Class components can also maintain their own state and respond to user interactions.

### Characteristics

- Uses class keyword
- Extends `React.Component`
- Includes constructor (optional)
- Contains `render()` method
- Can manage state

### Advantages

- Suitable for complex applications
- Supports lifecycle methods
- Can manage state internally

### Disadvantages

- More code compared to function components
- Slightly difficult for beginners
- Less commonly used in modern React applications

---

# 5. Function Component

A Function Component is simply a JavaScript function that returns JSX.

It is the most commonly used type of component because it is simple, clean, and requires less code.

Modern React encourages the use of function components along with React Hooks.

### Characteristics

- Written as a JavaScript function
- Returns JSX
- Easier to understand
- Requires less code
- Supports Hooks

### Advantages

- Easy to write
- Easy to debug
- Better readability
- Preferred in modern React

### Disadvantages

- Earlier versions of React did not support state in function components.
- Advanced features require Hooks.

---

# 6. Component Constructor

A **constructor** is a special method used inside a class component. It is executed automatically whenever a component object is created.

The constructor is mainly used for initializing the component's state and setting initial values.

### Syntax

```jsx
constructor(props) {
    super(props);

    this.state = {
        name: "Student"
    };
}
```

### Purpose of Constructor

- Initializes the state
- Sets default values
- Binds event handler methods
- Executes only once when the component is created

### Important Points

- Constructor is optional.
- If state is not required, there is no need to define a constructor.
- `super(props)` must be called before using `this`.

---

# 7. render() Function

The `render()` method is one of the most important methods in a class component.

It is responsible for displaying the user interface on the browser. Whatever JSX is returned by the `render()` method becomes visible on the web page.

Whenever the component's data changes, React automatically calls the `render()` method again to update the displayed content.

### Example

```jsx
class Home extends React.Component {
    render() {
        return (
            <h1>Welcome to the Home Page</h1>
        );
    }
}
```

### Features of render()

- Mandatory in every class component
- Returns JSX
- Displays UI elements
- Called automatically whenever updates occur

---

# Summary

In this experiment, I learned the basic concepts of React components. I understood that components are reusable building blocks used to create user interfaces. I also learned the difference between React components and normal JavaScript functions.

I studied the two main types of React components: Function Components and Class Components. Function components are simpler and widely used in modern React development, whereas Class Components use constructors and the `render()` method to display content and manage state.

Finally, I understood the purpose of constructors and the `render()` method in class components. These concepts form the foundation for building React applications and help in creating organized, reusable, and maintainable user interfaces.

---

# Conclusion

React components are the foundation of every React application. They help developers build applications by dividing the user interface into reusable sections. Understanding the differences between function and class components, along with the concepts of constructors and the `render()` method, is essential for developing React applications efficiently.

This experiment provided a clear understanding of component-based development and demonstrated how multiple components can be combined to build a complete React application such as the Student Management Portal.