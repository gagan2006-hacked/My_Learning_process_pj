package com.company;
abstract class pen{
    abstract public void write();
    abstract public void refill();
}
class Ink_pen extends pen{
    @Override
    public void refill() {
        System.out.println("refilling the pen ");
        String refill= """                                                                                                    
                      ..+*###%%%%%%%%%%%%%%%###*+:.                                                 
                      .-%####%%%%%%%%%%%%%%%%%%%%=.                                                 
                      .-###++##########%%%%%%%%%@=.                                                 
                      .-###++##########%%%%%%%%%@=.                                                 
                      .-###++##########%%%%%%%%%@=.                                                 
                      .-###++##########%%%%%%%%%@=.                                                 
                      .-%##++##########%%%%%%%%%@=.                                                 
                     ..=#+++****###########**+++#-..                                                
                    .=%=.........................+%-.                                               
                  .+#==-=**#######################+=#=.                                             
                .=#=--=*********+++++++++**********#++#=.                                           
              .=#=:-+**+==---=====+++++=====---=++***#++#=.                                         
          ...=#=:-++---=************************+=--=+*#++#=.                                       
         ..+%------******#%%##+-.........:+##%%#*****=--*%*=%=..                                    
        .-#==--=+****##*-:.....................::+##***+--+#+=#-.                                   
      ..=#---+****##=:.......:-***#####***=:.......:-##***=+##-#-..                                 
      .=#:-=****#*:.....:=*@@@@@@@@@@@@@@@@@@@#=:.....:*#****##-#-.                                 
     .:#--=***##-.....-%@@@@@@%%@@@@@%-%@#%@@@@@@%-.....:##***#*-#..                                
     .*+--+**#*:....:%@@@@@%@@:.%@@@@%.%@:+@@@@@@@@%-....:*#***%-++.                                
     :#:==***%-....:%@@@%-+%@@:#-@@@@%.%@==@@@@@@@@@@=....:#***#*-#:                                
    .**--+**##....:%@@@%#:*@@@.%+=@@@%.%@+-@@%*:=@@@@#:....+#***%-#+.                               
    :#--=***#+....:%@@@@@=*@@@:%@-*@@%.@@*-%*-#@@@@@@%-....=#***#+=#.                               
    -#:-+***#=....-%@@@@@+*@@@:%@%-@@#:@@#.:%@@@@@@@@@-....-#****#:#-                               
   .*=:-****%:....=@@@@@@*#@@@:#@@++@+=@@%.+@@@@@@@@@@+....-#****#-+*                               
  .:#:-+****#:....+@@@@@@##@@@:#@@%:%-+@@%.%+%@@@@@@@@*....:##***#*-#:.                             
  .+*:-+***#*:....*@@@@@@##@@@-*@@@#+.*@@%.%@#+@@@@@@@%.....*#****%-#=.                             
  .#=+#****#*.....%@@@@%%+*@@@==@@@%-.%@@%:#@@@++%@@@@@-....+#****#++*.                             
 .:#:##****#+....:@@@@@@@@@%@@@%@@@@@@@@@@%@@@@@@@@@@@@=....-#****#*:#..                            
 .+*-#*****#-.....*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%:....:%*****#:*=.                            
 .#-+#*****%:......:---------------------------------:.......#*****#==#.                            
 -#:*#*****#+:..............................................+#*****#*-#:                            
.+*:+#******###*+++++++++++++++++++++++++++++++++++++++++*###******#+:#=            ..              
 =#::*%###########################################################%*:-#-.....:+=----:-=...:......   
 .=#+---------------------------------------------------------------+#*+###################****:..  
 ....::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-=#######################*-:.  
                                               ......:-::::...:.:--...:=*#*==*#*#*****#*+==-..:::.  
                                           .--:=*##################**+-:::.................         
                                     ...:-*##################################*+=-:..                
                                     ..:=+#####################################+=-...               
                                      ......:=*############################****=-....               
                                       ...-+*##*=-:.=#*+##+=*#+++***+=::....  .....           
                """;
        System.out.println(refill);
    }

    @Override
    public void write() {
        System.out.println("Your pen is ready to write");
        String ready= """
                oooooooooo                              oooo                \s
                 888    888 ooooooooo8  ooooooo    ooooo888 oooo   oooo     \s
                 888oooo88 888oooooo8   ooooo888 888    888  888   888      \s
                 888  88o  888        888    888 888    888   888 888       \s
                o888o  88o8  88oooo888 88ooo88 8o  88ooo888o    8888        \s
                                                             o8o888         \s
                  o8                                                        \s
                o888oo ooooooo                                              \s
                 888 888     888                                            \s
                 888 888     888                                            \s
                  888o 88ooo88                                              \s
                                                                            \s
                                         o88    o8                          \s
                oooo  o  oooo oo oooooo  oooo o888oo ooooooooo8             \s
                 888 888 888   888    888 888  888  888oooooo8              \s
                  888888888    888        888  888  888                     \s
                   88   88    o888o      o888o  888o  88oooo888             \s
                """;
        System.out.println(ready);
    }
}
public class Pen_assign {
}
