package com.groupdocs.ui.annotation.entity.request;

import com.groupdocs.ui.common.entity.web.request.LoadDocumentRequest;

/**
 * TextCoordinatesRequest
 *
 * @author Aspose Pty Ltd
 */
public class TextCoordinatesRequest extends LoadDocumentRequest {
    /**
     * The number of page in document
     */
    private int pageNumber;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
