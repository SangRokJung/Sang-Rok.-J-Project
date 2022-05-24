(()=>{


const sectionSet = [
    {
        type : 'sticky',
        height: 0,          // 초기화 함수에서 계산하여 넣어줌.
        heightMultiple: 4,
        objs : {
            container   : document.querySelector('#section-0'),
            seriseMsgA  : document.querySelector('#section-0 .serise-message.a'),
            seriseMsgB  : document.querySelector('#section-0 .serise-message.b'),
            seriseMsgC  : document.querySelector('#section-0 .serise-message.c'),

        },
        values : {}
    },
    {
        type : 'normal',
        height: 0,
        heightMultiple: 2,
        objs : {
            container   : document.querySelector('#section-1'),
        },
        values : {}
    },        
    {
        type : 'sticky',
        height: 0,
        heightMultiple: 4,
        objs : {
            container   : document.querySelector('#section-2'),
        },
        values : {}
    }
];

//-----------------------------------------------------------------------
// 일반함수
//-----------------------------------------------------------------------
const initHTMLPage = function()
{
    //높이설정
    for(let i = 0; i < sectionSet.length; i++)
    {
        // 높이를 설정한다. 기준은 innerHeight
        sectionSet[i].height = window.innerHeight * sectionSet[i].heightMultiple;                 
        sectionSet[i].objs.container.style.height = `${sectionSet[i].height}px`;

    }


}
const getCurrentSection = function()
{

    
}
    
//-----------------------------------------------------------------------
// 이벤트 핸들러
//-----------------------------------------------------------------------
let yOffset = 0;            // 스크롤값 (scrollY)
let currentSection = 0      // 현재섹션

window.addEventListener('scroll', ()=>{
    yOffset = window.scrollY;
    currentSection = getCurrentSection();

});

window.addEventListener('load', ()=>{
    initHTMLPage();
});

})();
