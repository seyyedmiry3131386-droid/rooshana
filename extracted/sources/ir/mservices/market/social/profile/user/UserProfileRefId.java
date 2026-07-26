package ir.mservices.market.social.profile.user;

import ir.mservices.market.common.comment.data.response.ReviewResultDto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class UserProfileRefId {
    public static final UserProfileRefId b;
    public static final UserProfileRefId c;
    public static final UserProfileRefId d;
    public static final UserProfileRefId e;
    public static final UserProfileRefId f;
    public static final UserProfileRefId g;
    public static final UserProfileRefId h;
    public static final UserProfileRefId i;
    public static final UserProfileRefId j;
    public static final UserProfileRefId k;
    public static final UserProfileRefId l;
    public static final /* synthetic */ UserProfileRefId[] m;
    public final String a;

    static {
        UserProfileRefId userProfileRefId = new UserProfileRefId("DETAIL", 0, "detail");
        b = userProfileRefId;
        UserProfileRefId userProfileRefId2 = new UserProfileRefId("REVIEW", 1, ReviewResultDto.REVIEW_POST_ACTION_REVIEW);
        c = userProfileRefId2;
        UserProfileRefId userProfileRefId3 = new UserProfileRefId("SUB_REVIEW", 2, "sub_review");
        d = userProfileRefId3;
        UserProfileRefId userProfileRefId4 = new UserProfileRefId("FOLLOWERS", 3, "followers");
        e = userProfileRefId4;
        UserProfileRefId userProfileRefId5 = new UserProfileRefId("FOLLOWING", 4, "followees");
        f = userProfileRefId5;
        UserProfileRefId userProfileRefId6 = new UserProfileRefId("USER_SEARCH", 5, "user_search");
        g = userProfileRefId6;
        UserProfileRefId userProfileRefId7 = new UserProfileRefId("REQUESTS", 6, "requests");
        h = userProfileRefId7;
        UserProfileRefId userProfileRefId8 = new UserProfileRefId("OTHER_PROFILE_INTENT", 7, "other_profile_intent");
        UserProfileRefId userProfileRefId9 = new UserProfileRefId("MYNET", 8, "mynet");
        i = userProfileRefId9;
        UserProfileRefId userProfileRefId10 = new UserProfileRefId("MOVIE_REVIEW", 9, "movie_review");
        j = userProfileRefId10;
        UserProfileRefId userProfileRefId11 = new UserProfileRefId("REEL", 10, "reel");
        k = userProfileRefId11;
        UserProfileRefId userProfileRefId12 = new UserProfileRefId("USER_LIST", 11, "user_list");
        l = userProfileRefId12;
        UserProfileRefId[] userProfileRefIdArr = {userProfileRefId, userProfileRefId2, userProfileRefId3, userProfileRefId4, userProfileRefId5, userProfileRefId6, userProfileRefId7, userProfileRefId8, userProfileRefId9, userProfileRefId10, userProfileRefId11, userProfileRefId12};
        m = userProfileRefIdArr;
        kotlin.enums.a.a(userProfileRefIdArr);
    }

    public UserProfileRefId(String str, int i2, String str2) {
        this.a = str2;
    }

    public static UserProfileRefId valueOf(String str) {
        return (UserProfileRefId) Enum.valueOf(UserProfileRefId.class, str);
    }

    public static UserProfileRefId[] values() {
        return (UserProfileRefId[]) m.clone();
    }
}
