# This file details the progress of the security issues with this project

# Complete

## Issue 1: Physical computer security
  - Updated windows to latest security update
  - Purchases & installed Surfshark VPN + Antivirus (img shown below)
  - Enabled bitlocker on windows
  - Added 2F to microsoft accounts + authenticator app(s)


## Issue 2: Update third party libraries + Cleanup data leak with scan()     _commit id:_ b17bb8d
  - Verified libraries are update-to-date, and don't break existing code
  - Add a try{} block around scan() to ensure data leak is closed when finished
  - **Bonus**: unzipped project (easier git cloning)


# In Progress:

## Issue 3: Add License
## Issue 4: Add std unit testing with JUnit
## Issue 5: Accounting - log errors
## Issue 6: Invest in/Improve backup policy
