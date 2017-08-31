package org.controlsfx.exporter;

/**
 * Supported types of excel cell. This can be used to create a {@link ColumnExporter}
 * to define the column type in an Excel sheet. It corresponds to the 
 * Java equivalent type of cells in a {@link javafx.scene.control.TableColumn} 
 * in a {@link javafx.scene.control.TableView}.
 */
public enum ExcelCellType {

    /**
     * Constant to represent {@link String}
     */
    STRING,
    /**
     * Constant to represent {@link Number}
     */
    NUMBER,
    /**
     * Constant to represent {@link Boolean}
     */
    BOOLEAN
}
