# React Components – Theory

## Objectives

- Explain React components
- Identify the differences between components and JavaScript functions
- Identify the types of components
- Explain class component
- Explain function component
- Define component constructor
- Define `render()` function

---

# Introduction

React is an open-source JavaScript library developed by Facebook for building modern and interactive user interfaces. Instead of creating an entire webpage using one large file, React divides the application into small and reusable parts called **components**. Components make the application easier to develop, understand, and maintain. They also reduce code duplication because the same component can be used multiple times throughout an application.

In this experiment, I learned about React components, their types, the differences between React components and JavaScript functions, and the concepts of constructors and the `render()` method used in React applications.

---

# 1. React Components

A **React Component** is an independent and reusable block of code that represents a specific part of the user interface (UI). Every React application is built by combining multiple components.

Each component performs a separate task and returns JSX, which React converts into HTML elements displayed in the browser.

For example, in a Student Management Portal, the Home page, About page, Contact page, Navigation Bar, and Footer can all be created as separate React components.

### Features of React Components

- Reusable throughout the application.
- Improve code readability.
- Easy to maintain and update.
- Help organize large applications.
- Can receive data using props.
- Can contain state (Class Components and Function Components using Hooks).

### Advantages

- Reduces code duplication.
- Makes development faster.
- Improves maintainability.
- Encourages modular programming.
- Simplifies debugging and testing.

---

# 2. Difference Between React Components and JavaScript Functions

Although React components are written using JavaScript, they are different from normal JavaScript functions.

| React Component | JavaScript Function |
|-----------------|---------------------|
| Used to create user interfaces. | Used to perform logical operations or calculations. |
| Returns JSX (HTML-like syntax). | Returns JavaScript values. |
| Can receive Props. | Receives function parameters. |
| Rendered using `<Component />`. | Called using `functionName()`. |
| Used only in React applications. | Used in any JavaScript program. |

### Explanation

A JavaScript function performs calculations or executes a specific task. For example, it can add two numbers or validate user input.

A React component is responsible for displaying part of the webpage. It returns JSX that React renders on the browser.

Therefore, every React component is a JavaScript function or class, but not every JavaScript function is a React component.

---

# 3. Types of React Components

React provides two major types of components.

## A. Function Component

A Function Component is simply a JavaScript function that returns JSX.

It is the most commonly used type of component in modern React because it is simple, readable, and supports React Hooks.

### Features

- Written as a JavaScript function.
- Returns JSX.
- Supports React Hooks.
- Easy to understand.
- Requires less code.

### Advantages

- Lightweight.
- Better readability.
- Easier debugging.
- Preferred in modern React.

### Example

```jsx
function Home() {
    return (
        <h1>Welcome to Home Page</h1>
    );
}

export default Home;
```

---

## B. Class Component

A Class Component is created using JavaScript ES6 classes.

It extends `React.Component` and must include the `render()` method.

Class Components can manage state and lifecycle methods.

### Features

- Uses ES6 class syntax.
- Extends React.Component.
- Uses render() method.
- Can maintain state.
- Supports lifecycle methods.

### Advantages

- Suitable for large applications.
- Can manage internal state.
- Supports lifecycle methods.

### Example

```jsx
import React, { Component } from "react";

class Home extends Component {

    render() {
        return (
            <h1>Welcome to Home Page</h1>
        );
    }

}

export default Home;
```

---

# 4. Class Component

A Class Component is a JavaScript class that extends `React.Component`.

It provides additional features like state management and lifecycle methods. Every Class Component must contain a `render()` method because React calls this method to display the user interface.

Class Components were commonly used before the introduction of React Hooks. Although Function Components are preferred today, understanding Class Components is important because many existing React applications still use them.

### Characteristics

- Extends React.Component
- Contains render() method
- Can use constructor
- Can manage state
- Supports lifecycle methods

### Advantages

- Useful for complex applications.
- Better support for lifecycle methods.
- Can store and update data using state.

### Disadvantages

- More code than Function Components.
- Slightly difficult to understand for beginners.
- Less commonly used in modern React development.

---

# 5. Function Component

A Function Component is the simplest way to create a component in React.

It is simply a JavaScript function that returns JSX. Function Components are easier to write and require less code than Class Components.

Modern React applications mainly use Function Components along with Hooks for state management and lifecycle features.

### Characteristics

- Written using JavaScript functions.
- Returns JSX.
- Easy to maintain.
- Supports Hooks.
- Preferred in modern React.

### Advantages

- Simple syntax.
- Faster development.
- Less boilerplate code.
- Better readability.

### Disadvantages

- Earlier versions of React did not support state in Function Components.
- Advanced functionality requires React Hooks.

---

# 6. Component Constructor

A **constructor** is a special method used inside a Class Component.

It is automatically executed when the component object is created.

The constructor is mainly used for:

- Initializing the component state.
- Setting default values.
- Binding event handler methods.

### Syntax

```jsx
constructor(props) {
    super(props);

    this.state = {
        name: "Student"
    };
}
```

### Explanation

- `super(props)` calls the constructor of the parent class.
- `this.state` stores data related to the component.
- The constructor executes only once when the component is created.

### Important Points

- Constructor is optional.
- It is mainly used in Class Components.
- Always call `super(props)` before using `this`.

---

# 7. render() Function

The `render()` method is one of the most important methods in a Class Component.

Its responsibility is to return the JSX that should be displayed on the browser.

Whenever the component's state or props change, React automatically calls the `render()` method again to update the displayed user interface.

### Syntax

```jsx
class Home extends React.Component {

    render() {

        return (
            <h1>Welcome to Home Page</h1>
        );

    }

}
```

### Features of render()

- Mandatory in every Class Component.
- Returns JSX.
- Displays the user interface.
- Automatically updates the UI whenever data changes.
- Should not directly modify the component state.

---

# Summary

In this experiment, I learned the basic concepts of React Components and their importance in building modern web applications. I understood that components are reusable building blocks used to create different parts of a user interface.

I also learned the difference between React Components and JavaScript functions, the two types of components (Function Components and Class Components), the purpose of constructors, and the role of the `render()` method in Class Components.

These concepts provide the foundation for developing scalable, reusable, and maintainable React applications.

---

# Conclusion

React Components are the core building blocks of every React application. They help developers create reusable, organized, and maintainable code. Understanding Function Components, Class Components, constructors, and the `render()` method is essential for developing React applications efficiently. This experiment improved my understanding of component-based architecture and prepared me for creating more complex React applications in future.
