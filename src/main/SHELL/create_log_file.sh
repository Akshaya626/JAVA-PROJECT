#!/usr/bin/sh

# Define the file name
FILE_NAME="Application.log"

# Define the content
CONTENT=$(cat <<EOF
12-APR ERROR: This is Error1
12-APR INFO: This is INFO1
12-APR DEBUG: This is DEBUG1
12-APR ERROR: This is Error2
12-APR INFO: This is INFO2
12-APR DEBUG: This is DEBUG2
12-APR ERROR: This is Error3
12-APR INFO: This is INFO3
12-APR DEBUG: This is DEBUG3
12-APR ERROR: This is Error4
12-APR INFO: This is INFO4
12-APR DEBUG: This is DEBUG4
EOF
)

# Write content to the log file
echo "$CONTENT" > "$FILE_NAME"

echo "$FILE_NAME created with content."
