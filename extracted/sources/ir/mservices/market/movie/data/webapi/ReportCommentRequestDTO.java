package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportCommentRequestDTO implements RequestDTO, Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String IMMORAL = "Comment";
    public static final String UNRELATED = "CommentUnrelated";
    public static final String WRONG = "CommentFake";
    private final String type;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public ReportCommentRequestDTO(String str) {
        js3.p(str, "type");
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
