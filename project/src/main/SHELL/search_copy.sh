#!/bin/bash

# Define the directory path
directory="C:/Users/14704/Desktop/Test/ReadFiles"

# Check if the directory exists
if [ -d "$directory" ]; then
    # Get all files in the directory
    files=("$directory"/*)
    
    # Check if Akshaya is found in any file
    akshaya_found=false
    for file in "${files[@]}"; do
        if grep -q "Akshaya" "$file"; then
            echo "Found 'Akshaya' in $(basename "$file")"
            akshaya_found=true
        fi
    done
    
    # Check if Sri is found in any file
    sri_found=false
    for file in "${files[@]}"; do
        if grep -q "Sri" "$file"; then
            echo "Found 'Sri' in $(basename "$file")"
            sri_found=true
        fi
    done 
    
    # If both Akshaya and Sri are found, create f4.sh and append content
    if [ "$akshaya_found" = true ] && [ "$sri_found" = true ]; then
        # Create f4.sh
        touch "$directory/f4.sh"
        
        # Append contents of all files to f4.sh
        for file in "${files[@]}"; do
            cat "$file" >> "$directory/f4.sh"
        done
        
        echo "Content of all files appended to f4.sh"
    else
        echo "Akshaya and/or Sri not found in the expected files."
    fi
else
    echo "Directory not found: $directory"
fi
