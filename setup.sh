#!/bin/bash
rm -rf .git

# Replace readme with a TODO
rm README.md
echo "# TODO" >> README.md

# Build initial commit (exclude this setup file)
git init
git add .
git rm --cached "$0"
git update-index --chmod=+x ./gradlew
git commit -m "Initial empty project commit"

#Self destruct!
rm -- "$0"
