#!/usr/bin/env bash
​
echo "Git Automation"
​
git add .
​
echo "Git add . COMPLETE, What is your message for the commit: "
​
read message
​
echo "Message is : $message"
​
git commit -m "$message"
​
git push
​
echo "Latest Version and github Updated"