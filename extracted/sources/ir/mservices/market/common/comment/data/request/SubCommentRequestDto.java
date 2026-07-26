package ir.mservices.market.common.comment.data.request;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.common.data.ReviewMetadataDto;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class SubCommentRequestDto implements RequestDTO {

    @vo7("accountId")
    private final String accountId;

    @vo7("comment")
    private final String comment;

    @vo7("metadata")
    private final ReviewMetadataDto metadata;

    @vo7("parentId")
    private final String parentId;

    public SubCommentRequestDto(String str, String str2, String str3, ReviewMetadataDto reviewMetadataDto) {
        js3.p(str, "comment");
        js3.p(str2, "accountId");
        js3.p(reviewMetadataDto, "metadata");
        this.comment = str;
        this.accountId = str2;
        this.parentId = str3;
        this.metadata = reviewMetadataDto;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getComment() {
        return this.comment;
    }

    public final ReviewMetadataDto getMetadata() {
        return this.metadata;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public /* synthetic */ SubCommentRequestDto(String str, String str2, String str3, ReviewMetadataDto reviewMetadataDto, int i, yd1 yd1Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, reviewMetadataDto);
    }
}
