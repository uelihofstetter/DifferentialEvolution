/*
 * Copyrighted 2012-2013 Netherlands eScience Center.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").  
 * You may not use this file except in compliance with the License. 
 * For details, see the LICENCE.txt file location in the root directory of this 
 * distribution or obtain the Apache License at the following location: 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 * 
 * For the full license, see: LICENCE.txt (located in the root folder of this distribution). 
 * ---
 */

package nl.esciencecenter.diffevo;

public class EvalResult {
	
	private int sampleIdentifier;
	private int firstOccurence;
    private double[] parameterCombination;
    private double objScore;
    private double[][] modelResult;
    		
	public EvalResult(int sampleIdentifier, int firstOccurrence, double[] parameterCombination, double objScore) {
		this.sampleIdentifier = sampleIdentifier;
		this.firstOccurence = firstOccurrence;
		this.parameterCombination = parameterCombination.clone();
		this.objScore = objScore;
	}

	public EvalResult(int sampleIdentifier, int firstOccurrence, double[] parameterCombination, double objScore, double[][] modelResult) {
		this(sampleIdentifier,firstOccurrence,parameterCombination,objScore);
		this.modelResult = modelResult.clone();
	}

	
	
	public int getSampleIdentifier() {
		return sampleIdentifier;
	}

	public int getFirstOccurrence() {
		return firstOccurence;
	}

	public double[] getParameterCombination() {
		return parameterCombination.clone();
	}

	public double getObjScore() {
		return objScore;
	}

	public double[][] getModelResult() {
		return modelResult.clone();
	}

	public void setModelResult(double[][] modelResult) {
		this.modelResult = modelResult.clone();
	}
	
}
