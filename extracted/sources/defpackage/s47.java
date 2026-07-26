package defpackage;

import ir.mservices.market.movie.data.webapi.ReportCommentRequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class s47 {
    public final String a;
    public final int b;
    public final ReportCommentRequestDTO c;

    public s47(String str, int i, ReportCommentRequestDTO reportCommentRequestDTO) {
        this.a = str;
        this.b = i;
        this.c = reportCommentRequestDTO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s47)) {
            return false;
        }
        s47 s47Var = (s47) obj;
        return this.a.equals(s47Var.a) && this.b == s47Var.b && this.c.equals(s47Var.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31)) * 31) - 136480407;
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "ReportReviewData(movieId=", this.a, ", reviewId=", ", reportCommentRequestDTO=");
        sbB.append(this.c);
        sbB.append(", tag=REQUEST_TAG_REPORT_COMMENT)");
        return sbB.toString();
    }
}
