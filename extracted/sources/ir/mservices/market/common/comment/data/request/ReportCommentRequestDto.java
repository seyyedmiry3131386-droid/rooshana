package ir.mservices.market.common.comment.data.request;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportCommentRequestDto implements RequestDTO {

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    @vo7("type")
    private final String type;

    public interface Type {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String IMMORAL = "Comment";
        public static final String UNRELATED = "CommentUnrelated";
        public static final String WRONG = "CommentFake";

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String IMMORAL = "Comment";
            public static final String UNRELATED = "CommentUnrelated";
            public static final String WRONG = "CommentFake";

            private Companion() {
            }
        }
    }

    public ReportCommentRequestDto(String str, String str2) {
        js3.p(str, "type");
        this.type = str;
        this.text = str2;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }
}
