


function createBox(){
    let width = prompt("Enter a width");
    let height = prompt("Enter a height");
    
    console.log("Input width: " + width);
    console.log("Input height: " + height);
    console.log();
    let outputString = 'Shape:\n';
    for(let i = 0; i < height ; i++){
        for(let j = 0; j < width; j++){
            outputString += "*";
            if(j === (width-1)){
                outputString+="\n";
            }
        }
    }
    console.log(outputString);
}


function createCheckerBoard(){
    let width = prompt("Enter a width");
    let height = prompt("Enter a height");
    
    console.log("Input width: " + width);
    console.log("Input height: " + height);
    console.log();
    let cb_outputString = 'Shape:\n';
    // let check = true;
    let counter = 1;
    for(let i = 0; i < height ; i++){
        for(let j = 0; j < width; j++){
            if(counter%2==1){
            // if(check === true){
                cb_outputString += "*";
                // check = false;
            } else {
                cb_outputString += " ";

                // check = true;
            }
            if(j === (width-1)){
                cb_outputString+="\n";
                if(width%2==0){
                    counter++;
                }
            }
            counter++;
        }
    }
    console.log(cb_outputString);
}



function runCross(){

    let size = prompt("Enter the shape size");
    console.log("Input size: " + size);
    console.log();
    let outputString = 'Shape:\n';
    let x = 0;
    let y = size-1;
    for(let i = 0; i< size; i++){
        for (let j = 0; j < size; j++){
            if(j !== x && j !== y){
                outputString += " ";
            } else {
                outputString += "*";
            }
            if (j == size-1){
                outputString += "\n";
                x++;
                y--;
            } 
        }
    }
    console.log(outputString);
}

function runLower(){

    let side = prompt("Enter side length");
    console.log("Input side length: " + side);
    console.log();
    let outputString = 'Shape:\n';
    let x=0;
    for(let i=0; i<side; i++){
        for (let j = 0; j < side; j++){
            if (j<=x){
                outputString += "*";
            } else {
                outputString += " ";
            }
            if (j == side-1){
                outputString += "\n";
                x++;
            } 
        }
    }
    console.log(outputString);
}

function runUpper(){

    let side = prompt("Enter side length");
    console.log("Input side length: " + side);
    console.log();
    let outputString = 'Shape:\n';
    let x=0;
    for(let i=0; i<side; i++){
        for (let j = 0; j < side; j++){
            if (j>=x){
                outputString += "*";
            } else {
                outputString += " ";
            }
            if (j == side-1){
                outputString += "\n";
                x++;
            } 
        }
    }
    console.log(outputString);
}

function runTrapezoid(){
    let width = prompt("Enter a width");
    let height = prompt("Enter a height");
    
    console.log("Input width: " + width);
    console.log("Input height: " + height);
    console.log();
    let outputString = "";
    if(Math.floor(width/2) < height){
        outputString = "Impossible shape!";
    } else {
        outputString = 'Shape:\n';
        let x = 0;
        let y = width-1;
        for(let i=0; i<height; i++){
            for (let j = 0; j < width; j++){
                if(j>=x && j<=y){
                    outputString+="*"
                } else{
                    outputString+=" ";
                }
                if (j == width-1){
                    outputString += "\n";
                    x++;
                    y--;
                } 
            }
        }
    }
    console.log(outputString);
}