function main() {
    
    let r=readLine();
     const PI=Math.PI;
    let area=PI*r*r;
    console.log(area);
     let perimeter=2*PI*r;
     console.log(perimeter);
    try {    
        // Attempt to redefine the value of constant variable PI
        PI = 0;
        // Attempt to print the value of PI
        console.log(PI);
    } catch(error) {
        console.error("You correctly declared 'PI' as a constant.");
    }
}
