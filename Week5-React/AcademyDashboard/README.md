# Styling React Components – Theory

## Objectives

- Understanding the need for styling React components
- Working with CSS Modules and Inline Styles

---

# Introduction

React is a JavaScript library used to build modern and interactive web applications. While React components define the structure and functionality of an application, styling makes the application visually attractive and user-friendly.

Without styling, a React application only displays plain text and basic HTML elements. CSS helps improve the appearance of components by adding colors, spacing, borders, layouts, fonts, and other design elements.

In this experiment, I learned how to style React components using **CSS Modules** and **Inline Styles**. CSS Modules help create component-specific styles, while Inline Styles allow styles to be applied dynamically using JavaScript objects.

---

# 1. Need for Styling React Components

Styling is an important part of every web application. A well-designed user interface improves user experience and makes applications easier to understand and use.

React provides different methods to apply styles to components so that developers can organize and manage the appearance of their applications efficiently.

### Why Styling is Required

- Makes the application attractive.
- Improves readability.
- Enhances user experience.
- Creates responsive layouts.
- Separates design from functionality.
- Makes components reusable with different appearances.

### Benefits of Styling

- Better visual presentation.
- Easy maintenance.
- Consistent design throughout the application.
- Improved user interaction.
- Better organization of CSS code.

---

# 2. CSS Modules

A **CSS Module** is a CSS file where all class names are locally scoped to a particular React component.

Unlike normal CSS, CSS Modules prevent class name conflicts because every class is unique to its component.

CSS Modules are commonly created with the extension:

```text
ComponentName.module.css
```

### Features of CSS Modules

- Locally scoped CSS.
- Avoids naming conflicts.
- Better organization.
- Easy maintenance.
- Suitable for large React applications.

### Example CSS Module

```css
.box{
    width:300px;
    padding:20px;
    border:1px solid black;
    border-radius:10px;
}
```

### Importing CSS Module

```jsx
import styles from "./CohortDetails.module.css";
```

### Applying CSS Module

```jsx
<div className={styles.box}>
    Content
</div>
```

### Advantages

- Prevents CSS conflicts.
- Component-specific styling.
- Easier debugging.
- Better maintainability.
- Cleaner project structure.

---

# 3. Inline Styles

Inline Styles are styles written directly inside React components using the **style** attribute.

Unlike HTML, React uses a JavaScript object to define Inline Styles.

### Syntax

```jsx
<h1 style={{color:"blue"}}>
    Welcome
</h1>
```

Notice that:

- The outer braces `{}` indicate JavaScript.
- The inner braces `{}` represent a JavaScript object.

### Features

- Applied directly to components.
- Written as JavaScript objects.
- Supports dynamic values.
- No separate CSS file required.

### Advantages

- Dynamic styling.
- Easy conditional formatting.
- No class name conflicts.
- Useful for small style changes.

### Disadvantages

- Not suitable for large applications.
- Difficult to maintain if overused.
- Cannot use CSS pseudo-classes like `:hover`.

---

# 4. Difference Between CSS Modules and Inline Styles

| CSS Modules | Inline Styles |
|--------------|---------------|
| Stored in separate CSS files. | Written inside JSX. |
| Reusable across components. | Mostly used for individual elements. |
| Supports all CSS properties. | Uses JavaScript object syntax. |
| Easy to maintain. | Best for dynamic styling. |
| Prevents class name conflicts. | No external CSS required. |

---

# 5. Applying Styles in React

There are different ways to apply styles in React.

### External CSS

```jsx
import "./App.css";
```

---

### CSS Module

```jsx
import styles from "./Component.module.css";
```

---

### Inline Style

```jsx
<h2 style={{color:"red"}}>
    React
</h2>
```

---

# 6. Conditional Styling

One of the advantages of Inline Styles is that styles can change according to application data.

Example:

```jsx
<h3
style={{
color:
status==="ongoing"
?
"green"
:
"blue"
}}
>

Ongoing Cohort

</h3>
```

In this example,

- Green color is displayed when the status is **ongoing**.
- Blue color is displayed for all other statuses.

This makes the user interface more informative and interactive.

---

# 7. CSS Properties Used in This Experiment

The following CSS properties were used while styling the Cohort Details component.

| Property | Purpose |
|----------|----------|
| width | Sets the width of the box. |
| display | Displays elements inline-block. |
| margin | Adds space outside the box. |
| padding | Adds space inside the box. |
| border | Creates a border around the box. |
| border-radius | Creates rounded corners. |
| font-weight | Makes text bold. |
| color | Changes text color. |

---

# Summary

In this experiment, I learned the importance of styling React components. I understood that styling improves the appearance and usability of web applications. I also learned the difference between CSS Modules and Inline Styles.

CSS Modules provide locally scoped styles that avoid naming conflicts, whereas Inline Styles allow developers to apply dynamic styles directly inside JSX using JavaScript objects.

Finally, I learned how to apply conditional styling based on component data, making the application more interactive and visually appealing.

---

# Conclusion

Styling is an essential part of React application development. CSS Modules help organize and isolate component-specific styles, while Inline Styles provide flexibility for applying dynamic styles based on application data. Understanding these styling techniques helps developers create responsive, attractive, and maintainable React applications with a better user experience.