package common;

import java.util.Scanner;

import static common.ErrorCode.*;

// 정규표현식 Class
public class ValidCheck {

    private static Scanner scanner = new Scanner(System.in);

    //숫자 입력
    public final String NUMBER_REGEX = "^[0-9]*$";
    //이메일
    public final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    //ID 영어+문자 12글자 제한
    public final String ID_REGEX = "^[A-Za-z\\d]{1,12}";
    //PW 양어+숫자+특수문자 조합 8글자 이상
    public final String PW_REGEX ="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    // 유저 아이디 (이메일 형식) 정규식
    public final String SIGN_UP_ID_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    // 유저 비밀번호 (영문 + 숫자 + 특수문자 포함, 8~15자) 정규식
    public final String SIGN_UP_PASSWORD_REGEX = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$";
    // 유저 이름 (한글/영문, 2~30자)
    public final String SIGN_UP_NAME_REGEX = "^[가-힣a-zA-Z]{2,30}$";
    // 연락처 (국내번호 010-xxxx-xxxx 또는 02-xxx-xxxx, 해외번호도 고려)
    public final String SIGN_UP_PHONE_REGEX = "^(\\+\\d{1,3}[- ]?)?(\\d{2,4}[- ]?)?\\d{3,4}[- ]?\\d{4}$";
    // 주소 (한글, 영문, 숫자, 기본 특수문자 포함)
    public final String SIGN_UP_ADDRESS_REGEX = "^[가-힣A-Za-z0-9\\s,.-]{5,100}$";
    // 사업자 등록번호 (한국 기준: 000-00-00000)
    public final String SIGN_UP_BUSINESS_NUMBER_REGEX = "^\\d{3}-\\d{2}-\\d{5}$";





    /**
     * 정규표현식 검증하여 입력하는 메소드
     * @param regex
     * @return String
     */
    public String inputStringRegex(String regex){
        String str;
        do {
            str = scanner.nextLine();
            if (!str.matches(regex)){
                System.out.println(ERROR_INPUT.getText());
            }
        }while (!str.matches(regex) || str.isEmpty());
            return str;
    }

    /**
     * 숫자 입력하는 메소드
     * @return input
     */
    public int inputNumRegex(){
        String str;
        int input = 0;
        do {
            str = scanner.nextLine();
            if (str.matches(NUMBER_REGEX)) {
                input = Integer.parseInt(str);
                break;
            }
            System.out.println(ERROR_NUM.getText());
        }while (!str.matches(NUMBER_REGEX) || str.isEmpty());
        return input;
    }
}
