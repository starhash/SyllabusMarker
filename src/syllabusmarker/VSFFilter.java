/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package syllabusmarker;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Mahe
 */
public class VSFFilter extends FileFilter{

    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".vsf")||f.isDirectory();
    }

    @Override
    public String getDescription() {
        return "Virtual Syllabus File (.vsf)";
    }
    
}
