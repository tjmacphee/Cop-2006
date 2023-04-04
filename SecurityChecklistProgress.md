# This file details the progress of the security issues with this project

# Complete:
## Issue 1: Physical computer security
  - I've Updated my windows to the latest security update.
  - I've gone and purchased + installed Surfshark VPN + Antivirus (img shown below).
  - I've nabled bitlocker on windows & added TPM to ensure no 3rd party hardware has unathorized access.
  - I've added 2F to my microsoft accounts & authenticator app(s)
![image](https://user-images.githubusercontent.com/62121474/229658131-cc3f3917-dafe-472c-a445-f4b50f5154ba.png)

## Issue 2: Update third party libraries + Cleanup data leak with scan()     _commit id:_ b17bb8d
  - I've verified libraries are update-to-date, and don't break existing code.
  - I've added a try{} block around scan() to ensure data leak is cleaned up when finished.
  - **Bonus**: I unzipped the project so it's easier to clone & fork.


# In Progress:

## Issue 3: Add License (HIGH | EASY)
  - TODO: add an MIT license to project (needs to added to readme)

## Issue 4: Add std unit testing with JUnit (HIGH | MODERATE)
  - Install JUnit & transform main() into a class so JUnit can generate tests for it.

## Issue 5: Accounting - log errors (MED | MODERATE)
  - Create a txt file, catch errors & write them to the file

## Issue 6: Invest in/Improve backup policy (LOW | EASY)
  - Upload project(s) to backup harddrive, and even make a second github account with forked repos.
