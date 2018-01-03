@echo off

:: Commit all files without the files listed in .gitignore
git add -A && git commit -m "%date% %time%"