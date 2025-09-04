
# 🟡 Pacman Game – Java Console Edition 🎮

Welcome to the **classic Pacman game** recreated in Java! 🍒  
Guide Pacman, eat all the food dots, avoid enemies, and score big! ⭐

---

## 🚀 Features

- **Player Control**: Move Pacman using numeric inputs:
  - `1` – ⬆️ Up
  - `2` – ⬅️ Left
  - `3` – ⬇️ Down
  - `5` – ➡️ Right
- **Enemies 👾**: Two AI-controlled enemies move randomly across the board.
- **Scoring 🏆**: Eat dots (`.`) to increase your score.
- **Lives ❤️**: Start with 5 lives; lose lives if enemies catch you.
- **Game Over & Victory 🎉**:
  - Lose all lives → Game Over 💀
  - Eat all dots → Maximum score 🥇

---

## 📦 Classes

1. **`point`** – Represents x, y coordinates on the board. 📍  
2. **`Enemies`** – Controls enemy movement. 👹  
3. **`pacman_controlled_walk`** – Player-controlled Pacman. 🟡  
4. **`Board`** – Game board setup with walls `#` and food `.`. 🏗️  
5. **`Score_Card`** – Calculates and displays your score. 📝  
6. **`PLay`** – Handles game logic, moves, and turns. ⚡  
7. **`DriverOfPacman`** – Main class to start the game. 🎬  

---

## 🎮 How to Play

1. Clone the repository:
```bash
git clone <repo-url>
````

2. Compile all Java files:

```bash
javac Pacman_Game/*.java
```

3. Run the game:

```bash
java Pacman_Game.DriverOfPacman
```

4. Enter your Pacman’s first letter 🅿️ and follow the on-screen instructions.

---

## 🕹️ Gameplay Sample

```
-----------------------WELCOME TO PACMAN GAME------------------------
YOU HAVE 5 LIVES ❤️

Game Conditions:
1. Eat all food dots 🍒 while avoiding enemies 👾.
2. Enemies will refill food if they pass by.
3. Lose a life if caught by an enemy 💀.
4. Maximum score 🥇 if all dots are eaten.

==> ENTER THE 1ST LETTER OF THE PLAYER NAME: P
```

Use numeric keys to move Pacman and collect all food! 🟡

---

## 👨‍💻 Author

**Hasan Zarook**

---

## 💡 Notes

* This is a **console-based game**, no GUI yet. 💻
* Board is static, enemies move randomly. 🔄
* Can be extended with **graphics, power-ups, and more levels**! 🌟

```

---
