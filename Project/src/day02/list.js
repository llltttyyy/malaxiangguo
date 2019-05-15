import React from 'react'
class List extends React.Component{


constructor(props){
    super(props);
         this.state = {
             arr : [1,2,3]
         }
         setInterval(() =>{
            this.setState({
                arr : [...this.state.arr,Math.random()]

            })
         },1000);
}

     render(){
         let {arr} = this.state;
         return (
             <div>
                 <ul>
                   {

                       arr.map((item,index) => <li key = {index}>{item}</li>)
                   }
                 </ul>

             </div>
         );
     }
 

}
export default  List;