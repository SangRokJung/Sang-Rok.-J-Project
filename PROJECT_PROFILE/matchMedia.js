// if (window.matchMedia("(min-width: 1080px)").matches) {
//     /* 뷰포트 너비가 1080 픽셀 이상 */
//   } else {
//     /* 뷰포트 너비가 1080 픽셀 미만 */
//     console.log('matches')
//     document.addEventListener("DOMContentLoaded",() => {
//         const div_id_titleTag = document.querySelector('#div_id_title')
//         div_id_titleTag.style.marginLeft = `${20}px`
//     })
   
//   }

// document.addEventListener("DOMContentLoaded",() => {
//     const div_id_titleTag = document.querySelector('#div_id_title')
//     div_id_titleTag.style.marginLeft = `${20}px`

//     if (window.matchMedia("(min-width: 1080px)").matches) {
//         /* 뷰포트 너비가 1080 픽셀 이상 */
//         } 
//         else {
//         /* 뷰포트 너비가 1080 픽셀 미만 */
//         console.log('matches')
//         // document.addEventListener("DOMContentLoaded",() => {
//         //     const div_id_titleTag = document.querySelector('#div_id_title')
//         //     div_id_titleTag.style.marginLeft = `${20}px`
//         // })
       
//     }

// })

const media = matchMedia("screen and (min-width: 1024px)")
media.addListener((a) => {
    if (matchMedia("screen and (min-width: 1024px)").matches) {
        // 1024px 이상에서 사용할 스크립트
    } 
    else {
        // 1024px 미만에서 사용할 스크립트
    }
      
})
