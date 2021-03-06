/**
 * Exe2Jar - Copyright (c) 2018 - 2019 r0da [r0da@protonmail.ch]
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/ or send a letter to
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 *
 * By using Exe2Jar, you agree to the above license and its terms.
 *
 *      Attribution - You must give appropriate credit, provide a link to the license and indicate if changes were
 *                    made. You must do so in any reasonable manner, but not in any way that suggests the licensor
 *                    endorses you or your use.
 *
 *   Non-Commercial - You may not use the material (Exe2Jar) for commercial purposes.
 *
 *   No-Derivatives - If you remix, transform, or build upon the material (Exe2Jar), you may not distribute the
 *                    modified material. You are, however, allowed to submit the modified works back to the original
 *                    Exe2Jar project in attempt to have it added to the original project.
 *
 * You may not apply legal terms or technological measures that legally restrict others
 * from doing anything the license permits.
 *
 * No warranties are given.
 */

package core.pefile;

/**
 * Class / Struct d'une section
 * 
 * @author r0da
 */
public class SectionEntry {
   
    // Je ne prends que ce d'ont j'ai besoin
    public final int sectionId;
    public final String name;
    public final int virtualAddress;
    public final int sizeOfRawData;
    public final int pointerToRawData;
    
    private static int id = 0;
    
    public SectionEntry(String name, int virtualAddress, int sizeOfRawData, int pointerToRawData){
        this.sectionId = id++;
        this.name = name;
        this.virtualAddress = virtualAddress;
        this.sizeOfRawData = sizeOfRawData;
        this.pointerToRawData = pointerToRawData;
    }
}
