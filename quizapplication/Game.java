package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();
    
    public void initGame(){

        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }
      //  applying values to thr variables of the object
        questions[0].question="who is the strongest avenger?";
        questions[0].option1="Ironman";
        questions[0].option2="Thor";
        questions[0].option3="Hulk";
        questions[0].option4="Dr strange";
        questions[0].correctAnswer=2;


        questions[1].question="what is the closest planet to sun?";
        questions[1].option1="Earth";
        questions[1].option2="Venus";
        questions[1].option3="Mercury";
        questions[1].option4="Jupiter";
        questions[1].correctAnswer=3;

        questions[2].question="what is the capital of australia?";
        questions[2].option1="sydney";
        questions[2].option2="melbourne";
        questions[2].option3="Perth";
        questions[2].option4="Canberra";
        questions[2].correctAnswer=4;
    }

    public void play(){

        player.getDetails();
        for(int i=0;i<3;i++){

          boolean status=questions[i].askQuestion();
          if(status==true){
              System.out.println("well done");
              player.score++;
          }
          else{
              System.out.println("No help");
          }
        }

        System.out.println(player.name+" your score is "+player.score);


    }
}
