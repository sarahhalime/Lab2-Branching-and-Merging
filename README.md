# Lab 2: Branching and Merging

The main topic of this first lab activity is branching and merging in git.

## Resources and Acknowledgements

https://www.atlassian.com/git/tutorials/using-branches contains an excellent, detailed
walkthrough of the steps we will be going through in the lab. We encourage you to use
it as a reference as needed. The short video (about 4 minutes) is well worth a quick view
in the link above.

The first coding part in this activity is (very loosely) based on a common problem encountered in
problems posted on https://projecteuler.net/archives which is another interesting source of challenging
programming problems. You might also recognize that the multiples of 3 and 5 problem from
last week came from there. If you are looking for challenges, definitely check it out.

The partial cake recipes are courtesy ChatGPT.

At the bottom of the handout, you will find some hints and tips for the various tasks. We encourage you to try the problems on your own first, but if you get stuck, feel free to check out the hints and tips.

# TASK 0: Fork this repo

For this task, you will need to fork this repo at: https://github.com/CSC207-2026S-UofT/Lab2-Branching-and-Merging.

- [X] Make a fork of this repo and clone a local copy (as you did in Lab 1).
  - **Important**: make sure to **uncheck** the option to only fork the main branch, as the repo
  contains two branches you will use later in this lab.

For you to think: you actually have access to clone the original repo - so why won't we just work on this local copy, why do we need to fork?

# TASK 1: Your first branch
Fixing the bug is not the main focus of this task, if you are stuck, feel free to still push your code with the bug fix and check off the item, but we encourage you to try to fix the bug on your own first. The main focus of this task is to get you familiar with branching and merging.

- [X] Create and checkout a new branch called `task_1` using either IntelliJ or the Terminal:
  - IntelliJ: `Git -> New branch...`
  - Terminal: `git checkout -b task_1`
  - After, you can check `git status` or the Log tab of the Git tool window in IntelliJ to see
  that you are now on the `task_1` branch.
- [X] Open the TODO tool window (`View -> Tool Windows -> TODO`) and click on the TASK 1 TODO listed.
- [ ] Complete the TASK 1 TODO and commit your changes to this file (checking off the
completed items so far) and `Polymorphism.java` (remove the word TODO and your bug fix).
  - talk to those around you or your TA, then see the hints at the bottom of the readme if you get stuck.
  - the starter code is a simplified version of Tuesday's code demo. Think about how to use `instanceof` and casting to fix the bug in the code.
  - writing a getter method instead of accessing the file directly can be a good practice.
- [ ] Now, we'll merge the `task_1` branch back into `main`. When merging,
you need to be currently on the branch you are trying to merge into, so we'll first checkout the main
branch:
  - IntelliJ: `Git -> branches... -> main -> Checkout`
  - Terminal: `git checkout main`
Note: everything we've done has been local to our repository and have not pushed anything yet.
- [ ] We are back on `main`, so we can now do the merge and complete our work!
  - IntelliJ: `Git -> Merge... -> task_1 -> Merge`
  - Terminal: `git merge task_1`

You should now see the changes you had made are also in the `main` branch.

- [ ] Now, we'll want to clean up since we are done with our `task_1` branch.
  - IntelliJ: `Git -> branches... -> task_1 -> Delete`
  - Terminal: `git branch -d task_1`

- [ ] Last step, we'll push our changes to the remote repository to share our work! (As we did in Lab 1.)
  - we suggest you check off this last item, commit that change (just right on the main branch is fine;
  no need to branch for this little step), then push your code. Check GitHub to ensure you can
  see your changes.

And that's it for Task 1! You might be wondering about how we are supposed to get someone else
to review and approve our changes before we push our changes to the main branch of
our remote repository, since everything we just did was local. We'll explore how to do precisely
that by pushing our *branch* to our remote repository and making a **pull request** shortly, but first,
we'll talk about merge conflicts and how to resolve them.

Tip: In the Git tool window, you can open the `Console` tab to see the underlying git commands it
is performing when you ask IntelliJ to perform various git operations for you.

# TASK 2: Let's bake a cake!

Alice and Bob are planning to bake a cake, but can't agree on which recipe to use. They had
started working on the recipe in `recipe.md` together, and then each filled in the details of
what they felt would make the most delicious cake!
You'll notice that your repository already has two branches called `alice` and `bob`.

- [ ] Checkout the `alice` branch.
- [ ] Attempt to merge the `bob` branch into the `alice` branch using either IntelliJ or the Terminal.
  - You will be prompted to resolve a merge conflict. To do this, you will need to pick and choose which
  parts of each recipe to keep.
  - Read what either `git` or `IntelliJ` tells you in order to complete the merge process.
    - If you do the merge through the Terminal, you will need to edit `recipe.md` to remove all of the
    merge conflict symbols which `git` has added to your file. Once done, you will need to `git add` the
    `recipe.md` file and `git commit` to finish the merge.
- [ ] Once the merge is complete, delete the `bob` branch.

- [ ] Finally, checkout the `main` branch and merge the `alice` branch in (as we did previously).

Now, you are almost ready to share your recipe with the remote! 

# TASK 3

- [ ] Checkout a new branch called `task_3`.
- [ ] Commit any changes that you want to `recipe.md` to further improve the recipe.
- [ ] While still on the `task_3` branch, push your code to your remote repository on GitHub.
- [ ] Go to GitHub and you will see an option to make a pull request to the original repo. Make
  a pull request and see that it shows up in the original repository that you forked.

Since others will also be making pull requests, we won't *actually* accept any of them for now, but
you'll get lots of practice with pull requests in the next task and beyond!

We're now ready to dive into a collaborative coding challenge.

Proceed to the second lab activity on Quercus!

## Hints and Tips

### TASK 1 TODO: Hints
- Hint 1: For the field shadowing issue, use the getter method instead of accessing the field directly to get the correct polymorphic behavior.
- Hint 2: For the casting issue, always use instanceof to check the actual object type before casting to avoid a runtime error.

### TASK 2 (and possibly other places): Note about Unsaved local changes

If you have any local changes which you haven't committed, git will refuse to do certain operations
which would result in the loss of your changes. It will advise you on what you should do in order to
proceed. If you have any changes you want to keep, you will typically want to commit those changes.

Note: you can use `git status` or `Git -> commit...` to see the status of your files to check which
ones have changes not yet committed.

### TASK 3 Additional Note

When making a pull request, there may potentially be merge conflicts to resolve, as we saw in the
previous task. GitHub as additional information about how its interface helps facilitate resolving such
conflicts:

https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/addressing-merge-conflicts/resolving-a-merge-conflict-on-github
