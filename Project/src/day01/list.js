
import React from 'react';
import './list.css'
import { isTemplateElement } from '@babel/types';
function List(props){
    let {a,b,c} = props;
    alert(JSON.stringify(props));
       return(
           <ul className='list' > 
             data.map(function(item,index){
                
             })
              
           </ul>
       );

}
export default List;