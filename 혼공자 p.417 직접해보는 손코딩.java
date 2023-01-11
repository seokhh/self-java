public class Button {
    OnClickListener listener;

    void setListener(OnClickListener listener){
        this.listener = listener;
    } //값을 외부에서 받기 위해 set으로 설정
    void click(){
        listener.onClick();
    } //버튼을 클릭했을 때 쓰이는 메서드 버튼을 클릭했을때 구체적인 내용 작성 X
    // 개발자가 내용작성 설계자는 X

    static interface OnClickListener{
        void onClick();
    }
}