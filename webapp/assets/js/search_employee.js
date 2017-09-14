
 $(function(){
	 
		changeActiveGnb(3);
	 
     //가상의 local json data
     var gridData = [{seq:"1",create_date:"2007-10-01",create_name:"test",title:"note",hitnum:"11"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"},
                   {seq:"2",create_date:"2007-10-02",create_name:"test2",title:"note2",hitnum:"22"}
                   ];
      
     //jqGrid껍데기 생성
     $("#list").jqGrid({
         //로컬그리드이용
         datatype: "local",
         //그리드 높이
         height: 500,
         width:700,
         //컬럼명들
         colNames:['시퀀스','제목', '등록일', '등록자명','조회수'],
         //컬럼모델
         colModel:[
             {name:'seq',width: 75},
             {name:'title'},
             {name:'create_date'},
             {name:'create_name'},
             {name:'hitnum'}    
         ],
         //그리드타이틀
         caption: "그리드 목록"
     });
      
     // 스크립트 변수에 담겨있는 json데이터의 길이만큼
     for(var i=0;i<=gridData.length;i++){
             //jqgrid의 addRowData를 이용하여 각각의 row에 gridData변수의 데이터를 add한다
             $("#list").jqGrid('addRowData',i+1,gridData[i]);
     }
})