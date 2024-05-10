#!/usr/bin/bash

# Define the log file path
LOG_FILE="Application.log"

# Print all error messages
echo "Error Messages:"
grep "ERROR" "$LOG_FILE" | sed 's/^.*ERROR: //' 
