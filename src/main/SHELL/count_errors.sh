#!/usr/bin/sh

# Define the log file path
LOG_FILE="Application.log"

# Count the occurrences of "ERROR" in the log file
ERROR_COUNT=$(grep -c "ERROR" "$LOG_FILE")

# Print the count of errors
echo "Count of ERROR: $ERROR_COUNT"
