### Fuk the remote with your commits
```
git push origin dev --force
```
### Remote VSCode for repo
Hit the >. key , it opens up a browser editor for code

### Draft changes - Stash
Saves our changes somewhere safe & we can recover later
```
# stash changes
git stash

# get it back
# retrieve and remove from stash
git stash pop
# retrieve and keep in stash list
git stash apply

# see stash
git stash list
```
`!!! Stash by default drafts files that were modified, not newly CREATED !!!`
To stash the new created files too, do
```
git stash -u
```
Stash with a name too
```
git stash save mysecret // deprecated
git stash push -m "my new secret" //
```
### Log commit history
```
git log --graph --oneline --decorate
```
### Squashing commits
To combine all under one single commit
Ex
```
Instead of
commit A
commit B
commit C
commit DONE

You get - 
commit DONE
```
```
git rebase master --interactive
```

### The almighty - REBASE
Rebase allows you to-
* combine commits
* delete commits
* change commit msg
* change commit order
Use this to see commits
```
git log --oneline
```
While fixing a commit, we need to use its base commit while doing so
so basically, if we got
**A → B → C → D**
wanna change B? Start with A as base

And THIS, is how you do it
```
git rebase -i f89324 (A)
```
Then you will get
```
pick f59098 B
pick f59099 C
pick f59100 D
```
Now, change the one you wanna deal with
```
reword f59098 B
pick f59099 C
pick f59100 D
```

Commands-
* delete - drop/d
* change msg - reword/r
* reorder - just upar neeche in editor
* squash - combine it with the commit just above it

### Go back to prev branch
```
git checkout -
```

