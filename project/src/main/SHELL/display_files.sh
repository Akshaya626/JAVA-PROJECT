
#!/usr/bin/sh
# Specify the directory path
directory="C:/Users/14704/Desktop/Test/ReadFiles"

# Check if the directory exists
if [ -d "$directory" ]; then
    # Loop through each file in the directory
    for file in "$directory"/*; do
        # Check if the file is a regular file
        if [ -f "$file" ]; then
            echo "Contents of $(basename "$file"):"
            # Display the contents of the file line by line
            tail -n +2 "$file"
            echo "----------------------------------"
        fi
    done
else
    echo "Directory not found: $directory"
fi
