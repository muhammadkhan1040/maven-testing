# CI Testing Project - Guide for Eclipse Team Members

Hello Team! To get full credit for this CI project, **every single group member** must push code to their own repository to prove individual contribution, and must record their screen showing both a **failing TDD build** and a **passing CI build**. 

This guide provides a step-by-step approach to manually applying the code inside **Eclipse IDE** so it looks organic and satisfies all the project constraints.

---

## 🛠️ Prerequisite Setup

1. **Create a GitHub Repository**: Go to GitHub and create a new, empty repository (e.g. `maven-testing`). 
   - **Important**: Do NOT check "Add a README file" or ".gitignore". It should be completely empty.
2. **Copy the URL**: Keep the URL of your new repository handy (e.g., `https://github.com/<your-username>/maven-testing.git`).
3. **Extract the Project**: Unzip the `calculator-app` folder provided by your group member to a location on your computer (like your Documents or Workspace folder).

---

## 📥 Importing the Project into Eclipse

1. Open **Eclipse IDE**.
2. Go to **File** -> **Import...**
3. Select **Maven** -> **Existing Maven Projects** and click **Next**.
4. Set the **Root Directory** to the unzipped `calculator-app` folder you just saved.
5. Make sure the `/pom.xml` checkbox is ticked, and click **Finish**.
6. Eclipse will now download dependencies and set up the project. (If you see any errors on the `pom.xml`, right-click on the project in the Package Explorer -> **Maven** -> **Update Project...** -> Click OK).

---

## ❌ Phase 1: The "Failing Build" (Proving TDD)

Test-Driven Development (TDD) requires you to write unit tests *before* the application code exists. This means your first commit MUST fail the CI pipeline. Here is how you do it tracking through Eclipse.

### Step 1.1: Intentionally Break the Calculator
1. In the Eclipse Package Explorer, navigate to `src/main/java` -> `com.ci.project` -> open `Calculator.java`.
2. Change the top two methods (`add` and `subtract`) so they return `0` instead of doing the actual math:
   ```java
   // INTENTIONALLY BROKEN FOR TDD
   public int add(int a, int b) {
       return 0; 
   }

   public int subtract(int a, int b) {
       return 0; 
   }
   ```
3. Save the file (`Ctrl+S`).

### Step 1.2: Share Project and Link to Git
Eclipse has built-in Git integration (EGit plugin).
1. Right-click the `calculator-app` project folder in your Package Explorer.
2. Go to **Team** -> **Share Project...**
3. Check the box that says **"Use or create repository in parent folder of project"**.
4. Select the `calculator-app` folder in the list, and click the **Create Repository** button. Then click **Finish**.

### Step 1.3: Start Recording and Push!
1. **🟢 START YOUR SCREEN RECORDING NOW.**
2. Right-click the project folder again -> **Team** -> **Commit...**
3. The **Git Staging** tab will open (usually at the bottom of Eclipse).
4. Highlight all files in the **"Unstaged Changes"** box, right-click, and select **"Add to Index"** (they will move to the "Staged Changes" box).
5. In the **Commit Message** box, type: `TDD Phase 1: Adding Failing Unit Tests`
6. Click the **Commit and Push...** button.
7. A window will pop up. Paste your GitHub repository URL into the **URI** field. Enter your GitHub Personal Access Token/Credentials if prompted. Follow the menus to push to the `main` or `master` branch.
8. **Show the Failure**: Go to your GitHub repository in your web browser -> Click the **Actions** tab. 
9. You will see a workflow running. Wait a few seconds, and it will **FAIL** with a red X (because the math returns 0 but the test expects correct answers!). 
10. **🔴 STOP RECORDING.** You have successfully proven you understand TDD!

---

## ✅ Phase 2: The "Passing Build" (Continuous Integration)

Now that you've proven the tests fail when the code is wrong, you need to implement the actual code to make the CI pipeline pass successfully along with all Integration Tests.

### Step 2.1: Fix the Calculator
1. Open `Calculator.java` in Eclipse.
2. Change the `add` and `subtract` methods back to doing real math:
   ```java
   // IMPLEMENTED PROPERLY
   public int add(int a, int b) {
       return a + b;
   }

   public int subtract(int a, int b) {
       return a - b;
   }
   ```
3. Save the file (`Ctrl+S`).

### Step 2.2: Start Recording and Push!
1. **🟢 START YOUR SCREEN RECORDING NOW.**
2. Open the **Git Staging** tab in Eclipse again (or Right-click project -> Team -> Commit).
3. `Calculator.java` will be in the **Unstaged Changes**. Right-click it -> **Add to Index**.
4. In the **Commit Message**, type: `TDD Phase 2: Implementing Logic to pass tests`
5. Click **Commit and Push...** (It should remember your credentials from Phase 1).
6. **Show the Success**: Go back to your GitHub repository in your web browser -> Click the **Actions** tab. 
7. You will see the new workflow running. Wait a few seconds, and you will see the build **PASS** with a green checkmark! Both the Unit Tests and Integration tests successfully ran on Eclipse.
8. **🔴 STOP RECORDING.** 

**Congratulations!** You now have your own organic Git commits, a working CI environment using GitHub actions initiated from Eclipse, and the video recordings required for the final report!
