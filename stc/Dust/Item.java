 
 ​package​  dust.content​; 
  
 ​import​ ​arc.graphics.Color​; 
 ​import​ ​mindustry.ctype.ContentList​; 
 ​import​ ​mindustry.type.Item​; 
  
 ​public​ ​class​  DustItems​ ​implements​ ​ContentList​ { 
 ​    ​public​ ​static​ ​Item 
 ​        astral, Quelium; 
 ​    ; 
 ​    ​@Override 
 ​    ​public​ ​void​ ​load​() { 
 ​        Astral ​=​ ​new​ ​Item​(​"​astral"​, ​Color​.​valueOf(​"​#b5f3e9​"​)){{ 
 ​            flammability ​=​ ​ 0.05f​; 
 ​            explosiveness ​=​  0.4f​; 
 ​            radioactivity ​=​  1.2f​; 
 ​            charge ​=​  0.5f​; 
 ​            hardness ​=​ ​5​; 
 ​            cost ​=​ ​1.35f​; 
 ​        }}; 
  
 ​        Quelium ​=​ ​new​ ​Item​(​"​quelium"​, ​Color​.​valueOf(​"​#f6cccc​"​)){{ 
 ​            hardness ​=​ ​1​; 
 ​            cost ​=​ ​0.86f​; 
 ​        }}; 
  
 ​        
 ​    } 
 ​}
