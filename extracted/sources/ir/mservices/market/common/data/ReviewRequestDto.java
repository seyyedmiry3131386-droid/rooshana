package ir.mservices.market.common.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewRequestDto implements RequestDTO, Serializable {

    @vo7("accountId")
    private final String accountId;

    @vo7("comment")
    private final String comment;

    @vo7("metadata")
    private final ReviewMetadataDto metadata;

    @vo7("rating")
    private final int rating;

    public ReviewRequestDto(int i, String str, String str2, ReviewMetadataDto reviewMetadataDto) {
        js3.p(reviewMetadataDto, "metadata");
        this.rating = i;
        this.comment = str;
        this.accountId = str2;
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

    public final int getRating() {
        return this.rating;
    }
}
