# CLI To-Do List Application

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Execution](#setup-and-execution)
  - [Step 1: Clone or Create the Project](#step-1-clone-or-create-the-project)
  - [Step 2: Compile the Code](#step-2-compile-the-code)
  - [Step 3: Run the Program](#step-3-run-the-program)
- [How to Use](#how-to-use)
  - [Creating a Task](#creating-a-task)
  - [Viewing Tasks](#viewing-tasks)
  - [Editing a Task](#editing-a-task)
  - [Marking a Task as Done](#marking-a-task-as-done)
  - [Deleting a Task](#deleting-a-task)
  - [Exiting the Program](#exiting-the-program)
- [Example Usage](#example-usage)
- [Enhancements](#enhancements)
- [Contributing](#contributing)
- [License](#license)

## Overview
The CLI To-Do List application is a command-line Java program that helps users manage tasks. It allows users to create, view, edit, mark, and delete tasks, providing a simple yet effective way to organize their to-do list directly from the terminal.

## Features
- **Create Tasks:** Add new tasks to the list.
- **View Tasks:** Display all tasks with their status.
- **Edit Tasks:** Modify existing tasks.
- **Mark Tasks:** Mark tasks as completed.
- **Delete Tasks:** Remove tasks from the list.
- **Persistent Status:** Tasks retain their completion status when edited.

## Technologies Used
- **Java:** Core programming language used.
- **ArrayList:** For dynamic storage of tasks.
- **Scanner:** For reading user input.

## Setup and Execution

### Step 1: Clone or Create the Project
Save the code in a file named `CliTodoList.java`.

### Step 2: Compile the Code
Open your terminal and navigate to the directory where the file is saved. Compile the program using the command:
```bash
javac CliTodoList.java
```

### Step 3: Run the Program
Run the compiled program using:
```bash
java CliTodoList
```

## How to Use

### Creating a Task
1. Choose option `1` from the menu.
2. Enter the task description.
3. The task is added to your to-do list.

### Viewing Tasks
1. Choose option `2` to view all tasks.
2. The list displays tasks with their current status (`[ ]` for incomplete, `[X]` for completed).

### Editing a Task
1. Choose option `3` to edit a task.
2. Enter the task number you want to edit.
3. Provide the updated task description.

### Marking a Task as Done
1. Choose option `4` to mark a task as done.
2. Enter the task number to mark.
3. The task status changes to `[X]`.

### Deleting a Task
1. Choose option `5` to delete a task.
2. Enter the task number you want to remove.
3. The task is deleted from the list.

### Exiting the Program
1. Choose option `6` to exit the application.
2. The program will terminate with a goodbye message.

## Example Usage
**Input:**
```
--- CLI To-Do List ---
1. Create a To-Do
2. View To-Do List
3. Edit a To-Do
4. Mark a To-Do as Done
5. Delete a To-Do
6. Exit
Enter your choice: 1

Enter the task: Buy groceries
```

**Output:**
```
Task added successfully.

--- CLI To-Do List ---
1. Create a To-Do
2. View To-Do List
3. Edit a To-Do
4. Mark a To-Do as Done
5. Delete a To-Do
6. Exit
Enter your choice: 2

Your To-Do List:
1. [ ] Buy groceries
```

## Enhancements
Potential improvements include:
1. **File Storage:** Save tasks to a file for persistence across sessions.
2. **Undo Feature:** Allow users to undo their last action.
3. **Sorting and Filtering:** Enable sorting by completion status or due dates.
4. **Date and Time:** Add deadlines and reminders to tasks.
5. **User-Friendly Interface:** Implement a GUI for enhanced usability.

## Contributing
Contributions are welcome! If you wish to improve the project, fork the repository, make changes, and submit a pull request.

## License
This project is open-source and available under the MIT License.

---

Enjoy using the CLI To-Do List application!

