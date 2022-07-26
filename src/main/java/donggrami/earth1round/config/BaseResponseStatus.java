package donggrami.earth1round.config;

import lombok.Getter;

/**
 * 에러 코드 관리
 */
@Getter
public enum BaseResponseStatus {
    /**
     * 1000: 요청 성공
     */
    SUCCESS(true, 1000, "요청에 성공하였습니다."),

    /**
     * 2000: Request 오류
     */
    REQUEST_ERROR(false, 2000, "입력값을 확인해주세요."),
    EMPTY_JWT(false, 2001, "JWT를 입력해주세요."),
    EXPIRED_ACCESS_TOKEN(false, 2002, "Access token이 만료되었습니다."),
    INVALID_ACCESS_TOKEN(false, 2003, "유효하지 않은 access token 입니다."),
    EXPIRED_REFRESH_TOKEN(false, 2004, "Refresh token이 만료되었습니다."),
    INVALID_REFRESH_TOKEN(false, 2005, "유효하지 않은 refresh token 입니다."),
    POST_EMPTY_REFRESH_TOKEN(false, 2006, "Refresh token을 입력해주세요."),
    POST_PLACE_EMPTY_PLACE_NAME(false, 2007, "장소명을 입력해주세요."),
    POST_PLACE_EMPTY_LATITUDE(false, 2008, "위도를 입력해주세요."),
    POST_PLACE_EMPTY_LONGITUDE(false, 2009, "경도를 입력해주세요."),

    // [POST] /users

    // [POST] /courses
    POST_COURSES_EMPTY_STARTPLACE(false, 2300, "출발지를 입력해주세요."),
    POST_COURSES_EMPTY_ENDPLACE(false, 2301, "도착지를 입력해주세요."),
    POST_COURSES_WRONG_DISTANCE(false, 2302, "경로의 거리는 음수가 아닌 수로 입력해주세요."),

    /**
     * 3000: Response 오류
     */
    RESPONSE_ERROR(false, 3000, "값을 불러오는데 실패하였습니다."),

    /**
     * 4000: Database 오류
     */
    DATABASE_ERROR(false, 4000, "데이터베이스 연결에 실패하였습니다."),

    /**
     * 5000: Server 오류
     */
    SERVER_ERROR(false, 5000, "서버 연결에 실패하였습니다."),

    ;

    private final boolean isSuccess;
    private final int code;
    private final String message;

    private BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
