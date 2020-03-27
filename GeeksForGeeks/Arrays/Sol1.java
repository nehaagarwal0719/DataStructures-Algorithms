 int convertfive(int num) {
        
    if (num == 0) 
        return 0; 
  
    // Extraxt the last digit and 
    // change it if needed 
    int digit = num % 10; 
    if (digit == 0) 
        digit = 5; 
  
    // Convert remaining digits and 
    // append the last digit 
    return convertfive(num / 10) * 10 + digit; 
    }