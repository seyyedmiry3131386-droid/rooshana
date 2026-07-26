package ir.mservices.market.common.comment.data.response;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewResultDto extends ReviewDto implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String REVIEW_POST_ACTION_NONE = "none";
    public static final String REVIEW_POST_ACTION_REVIEW = "review";
    public static final String REVIEW_POST_ACTION_SURVEY = "survey";

    @vo7("postAction")
    private final String postAction;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewResultDto(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, float f, int i2, int i3, boolean z, boolean z2, String str10, Boolean bool, boolean z3, boolean z4, int i4, ReviewDto reviewDto) {
        super(i, str2, str3, str4, str5, str6, str7, str8, str9, f, i2, i3, z, z2, str10, bool, z3, z4, i4, reviewDto);
        js3.p(str4, "id");
        js3.p(str8, "nickname");
        js3.p(str10, "accountKey");
        this.postAction = str;
    }

    public final String getPostAction() {
        return this.postAction;
    }
}
