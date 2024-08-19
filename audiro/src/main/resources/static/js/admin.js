/**
 * templates/admin/*
 */

document.addEventListener('DOMContentLoaded', () => {
    // 사이드바 및 버튼 선택
    const sidebar = document.querySelector('.sidebar');
    const toggleBtn = document.querySelector('.toggle-btn');
    const toggleIcon = toggleBtn.querySelector('i');

    // 사이드바 열기/닫기 함수
    function toggleSidebar() {
        sidebar.classList.toggle('open');
        // 사이드바의 열린 상태에 따라 아이콘 변경
        if (sidebar.classList.contains('open')) {
            toggleIcon.textContent = 'arrow_back'; // 사이드바가 열려 있을 때 아이콘
        } else {
            toggleIcon.textContent = 'arrow_forward'; // 사이드바가 닫혀 있을 때 아이콘
        }
    }

    // 토글 버튼 클릭 이벤트 리스너 추가
    toggleBtn.addEventListener('click', toggleSidebar);
});

